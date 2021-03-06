/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.appengine.vertxhello;

import io.vertx.core.AbstractVerticle;

/*
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class Application extends AbstractVerticle {

  // Convenience method so you can run it in your IDE

  @Override
  public void start() throws Exception {
    vertx.createHttpServer().requestHandler(req -> {
      req.response().putHeader("content-type", "text/html").end("<html><body><h1>Hello from vert.x!</h1></body></html>");
    }).listen(8080);
  }
}