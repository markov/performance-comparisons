package org.gradle.test.performance43_1

import org.junit.Assert.*

class Test43_53 {
    private val production = Production43_53("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
