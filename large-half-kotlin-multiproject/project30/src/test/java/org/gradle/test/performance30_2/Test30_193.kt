package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_193 {
    private val production = Production30_193("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}