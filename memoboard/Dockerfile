# Build stage
FROM node:alpine

WORKDIR /app
COPY package*.json /app/
RUN npm install
RUN npm install -g @angular/cli@13.2.6
COPY ./ /app/
RUN ng build --extract-css --output-path=dist --prod=true

# Run Stage
FROM nginx
COPY default.conf /etc/nginx/conf.d/default.conf
COPY --from=build /app/dist /usr/share/nginx/html
