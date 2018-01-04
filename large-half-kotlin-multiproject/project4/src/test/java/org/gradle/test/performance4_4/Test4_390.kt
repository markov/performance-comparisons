package org.gradle.test.performance4_4

import org.junit.Assert.*

class Test4_390 {
    private val production = Production4_390("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}