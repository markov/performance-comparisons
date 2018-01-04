package org.gradle.test.performance5_5

import org.junit.Assert.*

class Test5_404 {
    private val production = Production5_404("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}