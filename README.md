# Jenkins realtime issues faced

### Errors 
* docker not installed
> /var/lib/jenkins/workspace/docker@tmp/durable-2a2ec786/script.sh.copy: 1: docker: not found 
* permission issue for docker : 
* sudo chmod 666 /var/run/docker.sock

: dial unix /var/run/docker.sock: connect: permission denied