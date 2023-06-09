#!/bin/bash
gradle bootJar
docker build -t xudean/veriff-webhook:1.0.0 .