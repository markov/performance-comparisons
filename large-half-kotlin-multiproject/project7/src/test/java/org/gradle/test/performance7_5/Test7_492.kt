package org.gradle.test.performance7_5

import org.junit.Assert.*

class Test7_492 {
    private val production = Production7_492("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}