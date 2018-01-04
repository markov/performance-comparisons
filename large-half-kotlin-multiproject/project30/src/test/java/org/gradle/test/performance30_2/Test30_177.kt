package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_177 {
    private val production = Production30_177("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}