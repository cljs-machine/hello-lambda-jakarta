#!/usr/bin/env node
try {
    require("source-map-support").install();
} catch(err) {
}
require("./out/goog/bootstrap/nodejs.js");
require("./out/hello_lambda_jakarta.js");
goog.require("hello_lambda_jakarta.free");
goog.require("cljs.nodejscli");
