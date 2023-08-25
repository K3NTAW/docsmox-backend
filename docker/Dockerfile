# Use the official Cassandra image as the base image
FROM cassandra:latest

# Set environment variables
ENV CASSANDRA_CLUSTER_NAME "DocsmoxCluster"
ENV CASSANDRA_DC "datacenter1"
ENV CASSANDRA_RACK "rack1"

# Expose Cassandra ports
EXPOSE 7000 7001 7199 9042 9160

# Copy any custom configuration files (if needed)
# COPY cassandra.yaml /etc/cassandra/cassandra.yaml

# Define entrypoint command to start Cassandra
CMD ["cassandra", "-f"]
