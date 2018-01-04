package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_131 {
    private val production = Production30_131("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}