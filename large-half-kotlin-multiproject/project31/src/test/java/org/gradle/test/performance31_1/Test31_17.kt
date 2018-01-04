package org.gradle.test.performance31_1

import org.junit.Assert.*

class Test31_17 {
    private val production = Production31_17("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}