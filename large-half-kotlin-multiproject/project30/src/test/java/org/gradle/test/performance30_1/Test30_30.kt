package org.gradle.test.performance30_1

import org.junit.Assert.*

class Test30_30 {
    private val production = Production30_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}