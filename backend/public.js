const express = require("express")
const path = require("path")
const index = express()
const port = process.env.PORT || 8001
let directory = path.join(__dirname, "public");
index.use(express.static(directory))
index.listen(port, () => console.log(`SC data collection server started on http://localhost:${port} ${directory}`))