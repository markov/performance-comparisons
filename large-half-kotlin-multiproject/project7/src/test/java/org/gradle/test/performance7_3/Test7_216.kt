package org.gradle.test.performance7_3

import org.junit.Assert.*

class Test7_216 {
    private val production = Production7_216("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}