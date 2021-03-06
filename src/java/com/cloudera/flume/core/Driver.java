/**
 * Licensed to Cloudera, Inc. under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  Cloudera, Inc. licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cloudera.flume.core;

import java.io.IOException;

import com.cloudera.flume.master.StatusManager.NodeState;

/**
 * This is an edge that connect a source to a sink. This is an abstract class
 * because we can have many different properties for the connection between
 * them.
 * 
 * The default will be a direct connection - synchronous, single thread, single
 * stack.
 * 
 * Others could include a asynchronous versions that use a lifo or pqueue that
 * allows for multiple threads of consumers.
 */
abstract public class Driver {

  abstract public EventSource getSource();

  abstract public EventSink getSink();

  abstract public void setSource(EventSource src);

  abstract public void setSink(EventSink snk);

  abstract public void start() throws IOException;

  abstract public void stop() throws IOException;

  abstract public void join() throws InterruptedException;

  abstract public NodeState getState();

  abstract public void registerListener(ConnectorListener listener);

  abstract public void deregisterListener(ConnectorListener listener);
}
