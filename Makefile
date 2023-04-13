.PHONY:

FILES := $(shell docker ps -aq)

local :
	mvn clean package -Dmaven.test.skip
	$(MAKE) -C infra local

stop-all :
	docker stop $(FILES)
	docker rm $(FILES)

clean :
	docker system prune -f

logs-local :
	docker logs -f $(FILES)
