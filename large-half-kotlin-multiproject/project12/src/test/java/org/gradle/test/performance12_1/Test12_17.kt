package org.gradle.test.performance12_1

import org.junit.Assert.*

class Test12_17 {
    private val production = Production12_17("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}