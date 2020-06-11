/*
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

package net.consensys.eventeum.service.catchup;

import net.consensys.eventeum.chain.contract.ContractEventListener;
import net.consensys.eventeum.dto.event.ContractEventDetails;
import net.consensys.eventeum.dto.event.filter.ContractEventFilter;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface EventRetriever {

    List<ContractEventDetails> retrieveEvents(ContractEventFilter eventFilter,
                                              BigInteger startBlock,
                                              BigInteger endBlock);
}