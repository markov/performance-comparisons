package org.gradle.test.performance4_1

import org.junit.Assert.*

class Test4_88 {
    private val production = Production4_88("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}