package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_198 {
    private val production = Production30_198("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}