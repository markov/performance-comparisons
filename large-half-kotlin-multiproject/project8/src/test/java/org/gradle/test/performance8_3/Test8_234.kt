package org.gradle.test.performance8_3

import org.junit.Assert.*

class Test8_234 {
    private val production = Production8_234("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}