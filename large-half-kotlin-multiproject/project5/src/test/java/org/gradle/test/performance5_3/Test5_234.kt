package org.gradle.test.performance5_3

import org.junit.Assert.*

class Test5_234 {
    private val production = Production5_234("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}