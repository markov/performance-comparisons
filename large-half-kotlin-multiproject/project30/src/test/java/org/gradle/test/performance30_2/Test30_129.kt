package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_129 {
    private val production = Production30_129("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}