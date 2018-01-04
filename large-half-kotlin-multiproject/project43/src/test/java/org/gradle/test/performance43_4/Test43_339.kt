package org.gradle.test.performance43_4

import org.junit.Assert.*

class Test43_339 {
    private val production = Production43_339("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
