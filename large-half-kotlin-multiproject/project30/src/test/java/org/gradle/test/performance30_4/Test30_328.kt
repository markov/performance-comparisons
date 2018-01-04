package org.gradle.test.performance30_4

import org.junit.Assert.*

class Test30_328 {
    private val production = Production30_328("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}