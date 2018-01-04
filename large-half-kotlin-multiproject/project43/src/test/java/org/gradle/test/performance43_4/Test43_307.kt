package org.gradle.test.performance43_4

import org.junit.Assert.*

class Test43_307 {
    private val production = Production43_307("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
