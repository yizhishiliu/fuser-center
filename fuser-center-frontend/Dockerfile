# 指定基础镜像
FROM nginx

# 指定工作目录
WORKDIR /usr/share/nginx/html/

# 执行执行用户
USER root

# 复制文件
COPY ./nginx.conf /etc/nginx/conf.d/default.conf
COPY ./dist  /usr/share/nginx/html/

# 暴露端口
EXPOSE 80

# 指定容器启动后要执行什么命令
CMD ["nginx", "-g", "daemon off;"]
