-- 创建数据库（如果不存在）
CREATE DATABASE IF NOT EXISTS messageboard CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 选择数据库
USE messageboard;

-- 创建留言表
CREATE TABLE IF NOT EXISTS messages (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    content TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
