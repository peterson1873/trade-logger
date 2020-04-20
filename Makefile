IMAGE := peterson1873/trade-logger
VERSION := 1.0.0

test:
	true

image:
	docker build -t ${IMAGE}:${VERSION} .
	docker tag ${IMAGE}:${VERSION} ${IMAGE}:${VERSION}

push-image:
	docker push ${IMAGE}:${VERSION}


.PHONY: image push-image test