FROM node:18.15.0 AS builder 
RUN apk --no-cache add --virtual builds-deps build-base python
WORKDIR /usr/src/app
COPY package.json ./
ENV TZ=Asia/Seoul

RUN npm install -y tzdata
COPY ./ ./

RUN npm run build

RUN npm prune --production
FROM node:18.15.0
WORKDIR /usr/src/app
COPY --from=builder /usr/src/app/dist ./dist
COPY --from=builder /usr/src/app/node_modules ./node_modules

EXPOSE 4000
CMD ["node", "./dist/main"]
