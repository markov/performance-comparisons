package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_131 {
    private val production = Production25_131("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}