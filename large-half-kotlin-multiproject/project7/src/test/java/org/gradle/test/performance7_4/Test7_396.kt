package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_396 {
    private val production = Production7_396("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}