package org.gradle.test.performance43_1

import org.junit.Assert.*

class Test43_30 {
    private val production = Production43_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
