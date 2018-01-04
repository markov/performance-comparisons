package org.gradle.test.performance34_5

import org.junit.Assert.*

class Test34_435 {
    private val production = Production34_435("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}