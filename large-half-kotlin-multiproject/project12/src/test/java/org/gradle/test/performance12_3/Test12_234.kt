package org.gradle.test.performance12_3

import org.junit.Assert.*

class Test12_234 {
    private val production = Production12_234("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}