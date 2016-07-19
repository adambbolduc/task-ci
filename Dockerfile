FROM clojure
ADD id_rsa /root/.ssh/id_rsa 
RUN chmod 700 /root/.ssh/id_rsa
RUN echo "Host github.com\n\tStrictHostKeyChecking no\n" >> /root/.ssh/config
RUN git clone git@github.com:adambbolduc/task-ci.git

WORKDIR task-ci
RUN lein deps
CMD ["lein", "with-profile", "dev", "ring", "server-headless"]
