# LuaJIT-Android
面向 Android 平台的 LuaJIT 集成项目，开箱即用

## 已配置
- LuaJIT 完整编译支持
- Android 架构：rm64-v8a
- 支持在 Android 直接运行 LuaJIT
- 支持 FFI 调用 C 语言 / 系统 SO
- 支持位运算库 bit
- 无需额外配置 NDK / 编译脚本
- 可直接运行 Lua 脚本、FFI、高性能 C 调用

## 适用场景
- Android 插件开发
- Lua 脚本热修复
- 高性能逻辑（FFI/C 比 Java 快 10~100 倍）
- 逆向、Hook、内存操作
- 游戏脚本、自动化工具

## 使用方式
1. 克隆本项目
2. 直接在 Android Studio 打开
3. 复制到自己项目
4. 打包运行即可执行
5. 可在 Lua 中使用：
   - FFI
   - bit
   - 标准 C 库
   - 调用 SO

## 示例代码
```lua
local ffi = require("ffi")
local bit = require("bit")

ffi.cdef[[
    int getpid(void);
    int clock(void);
]]

local C = ffi.C
log("PID: " .. C.getpid())
