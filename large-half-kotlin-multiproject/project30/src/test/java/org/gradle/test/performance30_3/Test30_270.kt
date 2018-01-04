package org.gradle.test.performance30_3

import org.junit.Assert.*

class Test30_270 {
    private val production = Production30_270("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}