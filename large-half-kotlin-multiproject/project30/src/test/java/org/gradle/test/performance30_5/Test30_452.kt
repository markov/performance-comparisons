package org.gradle.test.performance30_5

import org.junit.Assert.*

class Test30_452 {
    private val production = Production30_452("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}