package org.gradle.test.performance43_4

import org.junit.Assert.*

class Test43_310 {
    private val production = Production43_310("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
