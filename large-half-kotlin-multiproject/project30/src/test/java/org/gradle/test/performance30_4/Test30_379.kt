package org.gradle.test.performance30_4

import org.junit.Assert.*

class Test30_379 {
    private val production = Production30_379("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}