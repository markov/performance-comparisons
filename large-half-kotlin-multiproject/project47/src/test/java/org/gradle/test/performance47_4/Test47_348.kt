package org.gradle.test.performance47_4

import org.junit.Assert.*

class Test47_348 {
    private val production = Production47_348("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
