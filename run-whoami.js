#!/usr/bin/env node
try {
    require("source-map-support").install();
} catch(err) {
}
require("./out-whoami/goog/bootstrap/nodejs.js");
require("./out-whoami/whoami.js");
goog.require("whoami.core");
goog.require("cljs.nodejscli");
