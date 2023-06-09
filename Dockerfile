FROM ubuntu:latest
LABEL authors="xuda"

ENTRYPOINT ["top", "-b"]