#!/bin/bash

set -euxa pipefail

branches=$(cat .scripts/branches)

echo "$branches" | while read branch
do
  git checkout -b "$branch"
  git push origin "$branch"
done

git checkout master
