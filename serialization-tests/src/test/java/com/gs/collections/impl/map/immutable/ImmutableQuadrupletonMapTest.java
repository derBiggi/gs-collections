/*
 * Copyright 2013 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.impl.map.immutable;

import com.gs.collections.impl.test.Verify;
import org.junit.Test;

public class ImmutableQuadrupletonMapTest
{
    @Test
    public void serializedForm()
    {
        Verify.assertSerializedForm(
                1L,
                "rO0ABXNyAFljb20uZ3MuY29sbGVjdGlvbnMuaW1wbC5tYXAuaW1tdXRhYmxlLkFic3RyYWN0SW1t\n"
                        + "dXRhYmxlTWFwJEltbXV0YWJsZU1hcFNlcmlhbGl6YXRpb25Qcm94eQAAAAAAAAABDAAAeHB3BAAA\n"
                        + "AAR0AAFhcHQAAWJwdAABY3B0AAFkcHg=",
                new ImmutableQuadrupletonMap<String, Object>("a", null, "b", null, "c", null, "d", null));
    }
}
