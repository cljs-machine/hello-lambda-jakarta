#!/usr/bin/env node
try {
    require("source-map-support").install();
} catch(err) {
}
require("./out-uname/goog/bootstrap/nodejs.js");
require("./out-uname/uname.js");
goog.require("uname.core");
goog.require("cljs.nodejscli");
