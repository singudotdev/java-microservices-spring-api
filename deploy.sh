if [ "$EUID" -ne 0 ]; then
    echo "This script must be run as root or with sudo"
    exit 1
fi

docker build -t java-spring-keycloak-gateway ./gateway/
docker build -t java-spring-keycloak-api ./api/

docker compose up -d
