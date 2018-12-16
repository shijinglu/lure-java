#!/usr/bin/env bash

GIT_ROOT=$(git rev-parse --show-toplevel)
G4_FILE="antlr4/Lure.g4"
ANTLR_PATH="antlr4/antlr-4.7.1-complete.jar"
GEN_DIR="src/main/java/org/shijinglu/lure/grammar"
DEFAULT_PACKAGE="org.shijinglu.lure.grammar"

g4_path="${GIT_ROOT}/${G4_FILE}"
out_path="${GIT_ROOT}/${GEN_DIR}"
package_name="${DEFAULT_PACKAGE}"
jcp_path="${GIT_ROOT}/${ANTLR_PATH}"

function info {
    echo
    echo "./genSrc [-h | --help]"
    echo "./genSrc [-f | --file path] [-o | --out path] [-p | --package org.shijinglu] [-a | --antlr path]"
    echo
    echo "Named argumetns:"
    echo "  -f | --file      path to the gramma file, default to $g4_path"
    echo "  -o | --out       path to the output directory, default to $out_path"
    echo "  -p | --package   package name of the generated java classes, default to $DEFAULT_PACKAGE"
    echo "  -a | --antlr     path to antlr jar lib, default $jcp_path"
    echo
}

function parse_args {
    # named args
    while [[ "$1" != "" ]]; do
        case "$1" in
            -f | --file )       g4_path="$2";             shift;;
            -o | --out )        out_path="$2";            shift;;
            -p | --package )    package_name="$2";        shift;;
            -a | --antlr )      jcp_path="$2";            shift;;
            -h | --help )       info;                     exit;; # quit and show usage
            * )                 echo "unrecognized: $1"
        esac
        shift # move to next kv pair
    done

    # validate required args
    if [[ ! -f "${g4_path}" || -z "${out_path}" || ! -f "${jcp_path}" || -z "${package_name}" ]]; then
        echo "Invalid arguments"
        info
        exit;
    fi
}

parse_args "$@"

echo "java -Xmx500M -cp $jcp_path:$CLASSPATH org.antlr.v4.Tool -package $package_name -o $out_path $g4_path"
java -Xmx500M -cp "$jcp_path:$CLASSPATH" org.antlr.v4.Tool -package $package_name -o $out_path $g4_path


