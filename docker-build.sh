#!/bin/bash
gradle bootJar
docker build -t pado/pado-server:1.0.0 .