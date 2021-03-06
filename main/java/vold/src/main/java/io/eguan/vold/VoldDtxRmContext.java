package io.eguan.vold;

/*
 * #%L
 * Project eguan
 * %%
 * Copyright (C) 2012 - 2017 Oodrive
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import io.eguan.proto.vvr.VvrRemote.RemoteOperation;
import io.eguan.vvr.remote.VvrDtxRmContext;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.UUID;

/**
 * Resource manager context for the VOLD.
 * 
 * @author oodrive
 * @author jmcaba
 * 
 */
final class VoldDtxRmContext extends VvrDtxRmContext {
    private InetSocketAddress nodeAddress;
    private List<VoldLocation> oldPeersList;

    VoldDtxRmContext(final UUID resourceManagerId, final RemoteOperation operation) {
        super(resourceManagerId, operation);
    }

    /**
     * @return the nodeAddress
     */
    public final InetSocketAddress getNodeAddress() {
        return nodeAddress;
    }

    /**
     * @param nodeAddress
     *            the nodeAddress to set
     */
    public final void setNodeAddress(final InetSocketAddress nodeAddress) {
        this.nodeAddress = nodeAddress;
    }

    /**
     * @return the oldPeersList
     */
    public final List<VoldLocation> getOldPeersList() {
        return oldPeersList;
    }

    /**
     * @param oldPeersList
     *            the oldPeersList to set
     */
    public final void setOldPeersList(final List<VoldLocation> oldPeersList) {
        this.oldPeersList = oldPeersList;
    }

}
